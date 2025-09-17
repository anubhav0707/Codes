#include <iostream>
#include <vector>
using namespace std;

int main() {
    int N, M;
    cin >> N >> M;
    vector<vector<int>> mat(N, vector<int>(M));

    for (int i = 0; i < N; i++)
        for (int j = 0; j < M; j++)
            cin >> mat[i][j];

    for (int j = 0; j < M; j++) {
        for (int i = 0; i < N; i++) {
            cout << mat[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}
