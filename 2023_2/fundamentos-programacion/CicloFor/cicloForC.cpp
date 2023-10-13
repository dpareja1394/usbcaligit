#include <iostream>
using namespace std;

int main() {
    
    int altura = 10; // Altura de la letra "H"
    int anchura = 8; // Ancho de la letra "H"

    for (int i = 0; i <= altura; i++) {
        for (int j = 0; j <= anchura; j++) {
            
			if (j == 0 || i == 0 || i == altura) {
				cout << "C";
			} else {
				cout << " ";
			}
        }
        // Salto de línea al final de cada fila
        cout << "\n";
    }

    return 0;
    
}
