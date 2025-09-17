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

    int top = 0, bottom = N - 1;
    int left = 0, right = M - 1;

    while (top <= bottom && left <= right) {
        for (int i = left; i <= right; i++)
            cout << mat[top][i] << " ";
        top++;

        for (int i = top; i <= bottom; i++)
            cout << mat[i][right] << " ";
        right--;

        if (top <= bottom) {
            for (int i = right; i >= left; i--)
                cout << mat[bottom][i] << " ";
            bottom--;
        }

        if (left <= right) {
            for (int i = bottom; i >= top; i--)
                cout << mat[i][left] << " ";
            left++;
        }
    }

    return 0;
}
