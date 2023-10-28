#include <iostream>
using namespace std;

int factorial(int numero) {
	cout << "Ha ingresado a la función factorial con el parámetro: " << numero << endl;
    int valorFactorial;
	if (numero == 0) {
        valorFactorial=1;
    } else {
        valorFactorial = numero*factorial(numero-1);
    }
    cout << "El valor que va a retornar la función factorial es: " << valorFactorial << endl;
    return valorFactorial;   
}


int main() {
    int resultado = factorial(6);
    cout << "El factorial del número ingresado es: " << resultado << endl;
    return 0;
}


