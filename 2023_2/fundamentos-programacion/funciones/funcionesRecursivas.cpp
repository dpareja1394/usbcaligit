#include <iostream>
using namespace std;

int factorial(int numero) {
    if (numero == 0) {
        numero=1;
    } else {
        numero = numero*factorial(numero-1);
    }
    return numero;   
}


int main() {
    int resultado = factorial(5);
    cout << "El factorial del número ingresado es: " << resultado << endl;
    return 0;
}


