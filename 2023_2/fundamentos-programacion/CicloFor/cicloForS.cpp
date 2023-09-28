#include <iostream>
using namespace std;

int main() {
    int altura = 22; // Altura de la letra "S"

    for (int i = 0; i <= altura; i++) {
        for (int j = 0; j <= altura; j++) {
            if (i == 0 || i == altura) {
                // Imprimir la parte superior e inferior de la "S"
                cout << "S";
            } else if (i < altura / 2 && j == 0) {
                // Imprimir el trazo izquierdo superior de la "S"
                cout << "S";
            } else if (i == altura / 2) {
                // Imprimir la línea central de la "S"
                cout << "S";
            } else if (i > altura / 2 && j == altura) {
                // Imprimir el trazo derecho inferior de la "S"
                cout << "S";
            } else {
                // Imprimir espacios en blanco en otros lugares
                cout << " ";
            }
        }
        // Salto de línea al final de cada fila
        cout << endl;
    }

    return 0;    
    
}
