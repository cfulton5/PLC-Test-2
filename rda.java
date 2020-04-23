
void expr() {
	 System.out.println("Enter <expr>\n");
	 term();
	 while (nextToken() == ADD_OP || nextToken() == SUB_OP) {
		 lex();
		 term();
	 }
	 System.out.println("Exit <expr>\n");
}


void term() {
	 System.out.println("Enter <term>\n");
	 factor();
	 while (nextToken() == MULT_OP || nextToken() == DIV_OP) {
		 lex();
		 factor();
	 }
	 System.out.println("Exit <term>\n");
}


void factor() {
	 System.out.println("Enter <factor>\n");
	 if (nextToken() == IDENT || nextToken() == INT_LIT)
		 lex();
	 else { if (nextToken() == LEFT_PAREN) {
		 lex();
		 expr();
		 if (nextToken() == RIGHT_PAREN){
		 	lex();
		 }
		 else;
		 	error();
		 }
		 else;
			error();
	 }
	 System.out.println("Exit <factor>\n");
}
