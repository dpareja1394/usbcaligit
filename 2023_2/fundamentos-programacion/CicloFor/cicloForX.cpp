#include <iostream>
using namespace std;

int main() {
    
    int n = 17;
    
    for(int i = 0; i < n; i++) {
    	
    	for(int j = 0; j < n; j++) {
    		
    		if (i == j || i + j == n - 1) {
				cout << "*";
			}
				// Si no, imprimir un espacio en blanco
			else {
				cout << " ";
			}
    		
		}
		cout << endl;
    	
    	
	}
    
    return 0;
    
}
