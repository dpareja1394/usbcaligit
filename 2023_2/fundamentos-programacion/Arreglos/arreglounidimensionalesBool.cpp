#include <iostream>
using namespace std;

int main() {		//0   1   2   3   4
	bool numeros[5] = {true, false, false, false, true};

	cout << "Los elementos del arreglo son: ";

	for(int i = 0; i < 5; i++) {
		cout << numeros[i] << " ";
	}

	return 0;
}



