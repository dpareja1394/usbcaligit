#include <iostream>
using namespace std;

int main() {
	int numeros[3][2] = {	{1, 2}, 
							{3, 4}, 
							{5, 6}
							
							};

	cout << "Los elementos del arreglo bidimensional son: " << endl;

	for(int i = 0; i < 3; ++i) {
		// Recorre las filas
		for(int j = 0; j < 2; ++j) {
			// Recorre las columnas
			
			cout << numeros[i][j] << " ";
			
			//cout << "numeros[" << i << "][" << j << "] = " << numeros[i][j] << endl;
		}
		cout << endl;
		
	}

	return 0;
}

