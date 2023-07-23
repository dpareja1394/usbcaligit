#include <iostream>
using namespace std;

int main() {
    int n1, n2;
    string ingreseNumero = "Ingrese el valor para ";

    // Solicitar al usuario ingresar el número
    cout << ingreseNumero + "n1 ";
    cin >> n1;

    cout << ingreseNumero + "n2 ";
    cin >> n2;
    
    // Validar si el número es positivo, negativo o cero
    if (n1 > n2) {
        cout << to_string(n1) + " es mayor que "+ to_string(n2) << endl;
    } else if (n2 > n1) {
        cout << to_string(n2) + " es mayor que "+ to_string(n1) << endl;
    } else {
        cout << "Ambos números son iguales." << endl;
    }

    return 0;
}
