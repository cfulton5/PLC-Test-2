
static INT_LIT Integer.toHexString(10);
static IDENT Integer.toHexString(11);
static ASSIGN_OP Integer.toHexString(20);
static ADD_OP Integer.toHexString(21);
static SUB_OP Integer.toHexString(22);
static MULT_OP Integer.toHexString(23);
static DIV_OP Integer.toHexString(24);
static LEFT_PAREN Integer.toHexString(25);
static RIGHT_PAREN Integer.toHexString(26);

int main(void) {
	 	getChar();
	 do {
	 	lex();
	 } while (nextToken != EOF);
	 }
	 return 0;
}

int lookup(char ch) {
	 switch (ch) {
		 case '(':
			 addChar();
			 nextToken = LEFT_PAREN;
			 break;
		 case ')':
			 addChar();
			 nextToken = RIGHT_PAREN;
			 break;
		 case '+':
			 addChar();
			 nextToken = ADD_OP;
			 break;
		 case '-':
			 addChar();
			 nextToken = SUB_OP;
			 break;
		 case '*':
			 addChar();
			 nextToken = MULT_OP;
			 break;
		 case '/':
			 addChar();
			 nextToken = DIV_OP;
			 break;
		 default:
			 addChar();
			 nextToken = EOF;
			 break;
	 }
	 return nextToken;
}


void addChar(void) {
	if (lexLen <= 98) {
		lexeme[lexLen++] = nextChar;
		lexeme[lexLen] = '\0';
	} else
	System.out.println("Error - lexeme is too long \n");
}



void getChar(void) {
	 if ((nextChar = getc(in_fp)) != EOF) {
		 if (isalpha(nextChar))
		 	charClass = LETTER;
		 else if (isdigit(nextChar))
		 	charClass = DIGIT;
		 else
		 	charClass = UNKNOWN;
	 } else
	 	charClass = EOF;
}


void getNonBlank(void) {
	while (isspace(nextChar))
	getChar();
}


int lex(void) {
	 lexLen = 0;
	 getNonBlank();
	 switch (charClass) {
		 case LETTER:
			 addChar();
			 getChar();
			 while (charClass == LETTER || charClass == DIGIT) {
				 addChar();
				 getChar();
			 }
			 nextToken = IDENT;
			 break;
		 case DIGIT:
			 addChar();
			 getChar();
			 while (charClass == DIGIT) {
				 addChar();
				 getChar();
			 }
			 nextToken = INT_LIT;
		 	break;
		 case UNKNOWN:
			 lookup(nextChar);
			 getChar();
			 break;
		case EOF:
			 nextToken = EOF;
			 lexeme[0] = 'E';
			 lexeme[1] = 'O';
			 lexeme[2] = 'F';
			 lexeme[3] = '\0';
		 	break;
	 }
	 System.out.println("Next token is: %d, Next lexeme is %s\n",
	 nextToken, lexeme);
	 return nextToken;
}