#include <iostream>
using namespace std;

int main() {
    
    int n = 23; // Altura del rombo (debe ser un número impar)
    
    // Parte superior del rombo
    for (int i = 0; i < n / 2 + 1; i++) {
        for (int j = 0; j < n / 2 - i; j++) {
            cout << " ";
        }
        for (int j = 0; j < 2 * i + 1; j++) {
            cout << "*";
        }
        cout << endl;
    }

    // Parte inferior del rombo
    for (int i = n / 2 - 1; i >= 0; i--) {
        for (int j = 0; j < n / 2 - i; j++) {
            cout << " ";
        }
        for (int j = 0; j < 2 * i + 1; j++) {
            cout << "*";
        }
        cout << endl;
    }

    return 0;
    
}
