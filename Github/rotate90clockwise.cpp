#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

void rotateAntiClockwise(vector<vector<int>>& mat) {
    int n = mat.size();
    for (int i = 0; i < n; i++)
        for (int j = i; j < n; j++)
            swap(mat[i][j], mat[j][i]);

    for (int j = 0; j < n; j++) {
        int top = 0, bottom = n - 1;
        while (top < bottom) {
            swap(mat[top][j], mat[bottom][j]);
            top++;
            bottom--;
        }
    }
}

int main() {
    int n;
    cin >> n;
    vector<vector<int>> mat(n, vector<int>(n));
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            cin >> mat[i][j];

    rotateAntiClockwise(mat);

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++)
            cout << mat[i][j] << " ";
        cout << endl;
    }
    return 0;
}
