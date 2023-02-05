#include <bits/stdc++.h>
using namespace std;

void bfs(vector<int> g[], vector<int> &v, int root) {
    v[root] = 1;
    queue<int> q;
    q.push(root);
    while (!q.empty()) {
        int curr = q.front(); q.pop();

        for(int n : g[curr]){
            if(!v[n]){
                q.push(n);
                v[n] = 1;
            }
        }
    }
}

int main() {
    int n, m, a, b;
    bool printed = false;
    cin >> n >> m;
    vector<int> graph[n+1];
    vector<int> visited(n+1,0);

    while(m--) {
        cin >> a >> b;
        graph[a].push_back(b);
        graph[b].push_back(a);
    }

    bfs(graph, visited, 1);

    for(int i = 1; i <= n; i++){
        if(visited[i])
            continue;
        else{
            printed = true;
            cout << i << endl;
        }
    }

    if (!printed)
        cout << "Connected" << endl;
    return 0;
}
