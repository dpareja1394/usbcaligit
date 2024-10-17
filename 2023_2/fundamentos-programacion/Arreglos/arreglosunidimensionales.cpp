#include <iostream>
using namespace std;

int main() {		//0   1   2   3   4
	int numeros[5] = {85, 23, 12, 13, 20};

	cout << "Los elementos del arreglo son: ";

	for(int i = 4; i >= 0; i--) {
		cout << numeros[i] << " ";
	}

	return 0;
}



