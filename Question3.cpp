#include <iostream>
#include <chrono> 
using namespace std::chrono;

int main(void)  {
    static char staticArray[5000];//stack array
    char stackArray[5000];//stack array
    char *heapArray = new char[5000]; // heap array


    
    auto start = high_resolution_clock::now();
    
    for(int i = 0; i<100001; ++i){
      staticArray;
    }

    auto stop = high_resolution_clock::now();
    auto duration = duration_cast<microseconds>(stop - start);
    std::cout << "Static Array Time: " << duration.count() << std::endl;
    
    auto start2 = high_resolution_clock::now();
    for(int i = 0; i<100001; ++i){
      stackArray;
    }
    auto stop2 = high_resolution_clock::now();
    auto duration2 = duration_cast<microseconds>(stop2 - start2);
    std::cout << "Stack Array Time: " << duration2.count() << std::endl;

    auto start3 = high_resolution_clock::now();
    for(int i = 0; i<100001; ++i){
      *heapArray;
    }
    auto stop3 = high_resolution_clock::now();
    auto duration3 = duration_cast<microseconds>(stop3 - start3);
    std::cout << "Heap Array Time" << duration3.count();
}