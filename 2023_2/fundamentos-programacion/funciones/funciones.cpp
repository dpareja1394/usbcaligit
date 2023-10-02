// Ingresar un año de nacimiento.
// Validar contra el año actual (2023) si la persona es mayor de edad o no en Colombia.
// Validar contra el año actual (2023) si la persona es mayor de edad en USA.
#include <iostream>
using namespace std;
int solicitarAnoNacimiento() {
	int anoNacimiento;

    // Solicitar al usuario ingresar el número
    cout << "Ingrese el a�o de nacimiento: ";
    cin >> anoNacimiento;
    
    return anoNacimiento;
    
}

int calcularEdad(int anoNacimiento) {
    int edad = 2023 - anoNacimiento;
    cout << edad << endl;
    
    return edad;
}

int main() {
    int mayoriaEdadColombia = 18, mayoriaEdadUSA = 21;
    // Llamado al método o función
    int anoNacimiento = solicitarAnoNacimiento();
    int edad = calcularEdad(anoNacimiento);

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


