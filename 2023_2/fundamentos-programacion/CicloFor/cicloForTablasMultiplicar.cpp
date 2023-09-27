#include <iostream>
using namespace std;

int main() {
    
    int resultado = 0;
    
    for(int i = 1; i<= 10; i++) {
    	
    	for(int j = 1; j<=10; j++) {
    		resultado = i*j;
    		cout<< i << " x " << j << " = " <<resultado << endl;
		}
    	
    	
	}
    
    return 0;
    
}
