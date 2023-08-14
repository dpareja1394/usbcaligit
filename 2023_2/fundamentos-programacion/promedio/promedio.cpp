#include <iostream>
using namespace std;

int main() {
    double n1, n2, n3, promedio;
    string textoEntrada = "Ingrese el valor para ";

    // Solicitar al usuario ingresar el número
    cout << textoEntrada + "n1 \n";
    cin >> n1;

    cout << textoEntrada + "n2 \n";
    cin >> n2;

    cout << textoEntrada + "n3 \n";
    cin >> n3;

    //cout << n1 << n2 << n3 << endl;
    promedio = (n1+n2+n3)/3;

    cout << "El promedio es "<< promedio <<endl;


    return 0;
}
