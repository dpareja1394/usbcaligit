#include <iostream>
#include <string>
#include <sstream>

int main() {
    std::string input;
    std::cout << "Ingresa números en el formato 'num1 y num2': ";
    std::getline(std::cin, input);

    // Utilizar un stringstream para extraer los números de la cadena
    std::istringstream iss(input);
    int num1, num2;
    char separator;  // Para almacenar el carácter de separación (en este caso, 'y')

    if (iss >> num1 >> separator >> num2 && separator == 'y') {
        std::cout << "Primer número: " << num1 << std::endl;
        std::cout << "Segundo número: " << num2 << std::endl;
    } else {
        std::cout << "Formato incorrecto. Asegúrate de ingresar los números en el formato 'num1 y num2'." << std::endl;
    }

    return 0;
}
