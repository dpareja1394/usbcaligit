// Ingresar un año de nacimiento.
// Validar contra el año actual (2023) si la persona es mayor de edad o no en Colombia.
// Validar contra el año actual (2023) si la persona es mayor de edad en USA.
#include <iostream>
using namespace std;

int main() {
    int anoNacimiento;

    // Solicitar al usuario ingresar el número
    cout << "Ingrese el año de nacimiento: ";
    cin >> anoNacimiento;
    int mayoriaEdadColombia = 18, mayoriaEdadUSA = 21;

    int edad = 2023 - anoNacimiento;
    cout << edad << endl;

    // Validar si el número es positivo, negativo o cero
    if (edad > mayoriaEdadUSA) {
        cout << "Es mayor de edad en USA y en Colombia." << endl;
    } else if (edad > mayoriaEdadColombia) {
        cout << "Es mayor de edad solo en Colombia" << endl;
    } else {
        cout << "No es mayor de edad en USA ni en Colombia." << endl;
    }

    return 0;
}
