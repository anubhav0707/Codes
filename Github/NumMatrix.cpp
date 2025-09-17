#include <iostream>
#include <vector>
using namespace std;

int main() {
    int N, M;
    cin >> N >> M;

    vector<vector<int>> arr(N, vector<int>(M));

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            cin >> arr[i][j];
        }
    }

    for (int col = 0; col < M; col++) {
        if (col % 2 == 0) {
            for (int row = 0; row < N; row++) {
                cout << arr[row][col] << " ";
            }
        } else {
            for (int row = N - 1; row >= 0; row--) {
                cout << arr[row][col] << " ";
            }
        }
    }

    return 0;
}
