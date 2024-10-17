#include <iostream>
using namespace std;

int main() {
    
    int altura = 20; // Altura de la letra "I"
    int anchura = 16; // Ancho de la letra "I"

    for (int i = 0; i <= altura; i++) {
        for (int j = 0; j <= anchura; j++) {
            
			if (i == 0 || i == altura) {
				cout << "I";
			} else if (j == (anchura / 2)){
				cout << "I";
			} else {
				cout << " ";
			}
			
        }
        // Salto de línea al final de cada fila
        cout << "\n";
    }

    return 0;
    
}
