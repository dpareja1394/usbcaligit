#include <iostream>
using namespace std;

int factorial(int numero) {
	cout << "Ha ingresado a la funci�n factorial con el par�metro: " << numero << endl;
    int valorFactorial;
	if (numero == 0) {
        valorFactorial=1;
    } else {
        valorFactorial = numero*factorial(numero-1);
    }
    cout << "El valor que va a retornar la funci�n factorial es: " << valorFactorial << endl;
    return valorFactorial;   
}


int main() {
    int resultado = factorial(6);
    cout << "El factorial del n�mero ingresado es: " << resultado << endl;
    return 0;
}


