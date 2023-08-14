#include <iostream>
using namespace std;

int main() {
    double a, b, suma, sumaIVA, pagoUsuario, devolucion;
    string textoEntrada = "Ingrese el valor para ";

    // Solicitar al usuario ingresar el número
    cout << textoEntrada + "a \n";
    cin >> a;
    
    cout << textoEntrada + "b \n";
    cin >> b;
    
    suma = a + b;

    cout << "Suma "<< suma <<endl;
    
    sumaIVA = suma * 1.19;

 	cout << "Valor a pagar "<< sumaIVA << " \n" <<endl;

	cout << "Ingrese el valor con el que va a pagar \n";
    cin >> pagoUsuario;
    
    devolucion = pagoUsuario - sumaIVA;

	cout << "Valor a devolver: "<< devolucion << endl;

    return 0;
}
