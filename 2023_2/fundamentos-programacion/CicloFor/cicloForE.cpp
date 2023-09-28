#include <iostream>
using namespace std;

int main() {
    int altura = 22; // Altura de la letra E

    for (int i = 0; i <= altura; i++) {
        for (int j = 0; j <= altura; j++) {
            if (i == 0 || i == altura) {
                cout << "E";
            } else if (j == 0) {
                cout << "E";
            } else if ( i == (altura / 2)) {
                cout << "E";
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
