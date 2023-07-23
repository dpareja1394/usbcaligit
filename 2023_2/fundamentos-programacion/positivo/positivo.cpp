#include <iostream>
using namespace std;

int main() {
    int numero;

    // Solicitar al usuario ingresar el número
    cout << "Ingrese un número entero: ";
    cin >> numero;

    // Validar si el número es positivo, negativo o cero
    if (numero > 0) {
        cout << "El número ingresado es positivo." << endl;
    } else if (numero < 0) {
        cout << "El número ingresado es negativo." << endl;
    } else {
        cout << "El número ingresado es cero." << endl;
    }

    return 0;
}
