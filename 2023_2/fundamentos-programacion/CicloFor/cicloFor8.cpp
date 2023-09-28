#include <iostream>
using namespace std;

int main() {
    int altura = 10; // Altura del número 3

    for (int i = 0; i <= altura; i++) {
        for (int j = 0; j <= altura; j++) {
            if (i == 0 || i == altura || i == (altura/2)) {
                cout << "8";
            } else if (j==0 || j == altura) {
                cout << "8";
            } 
            else {
                // Imprimir espacios en blanco en otros lugares
                cout << " ";
            }
        }
        // Salto de línea al final de cada fila
        cout << endl;
    }

    return 0;    
    
}
