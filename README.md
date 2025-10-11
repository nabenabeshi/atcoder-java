# AtCoder Java Repository

## 概要

このリポジトリは、私 (yuuuy) が AtCoder Beginner Contest (ABC) に参加した結果を記録するものです。

**注意**：コンテストで解答できなかった問題は、正しく動作しない実装が含まれている可能性があります。

---

## 開発ワークフロー

このリポジトリでは、VSCodeのタスク機能を利用して開発作業を効率化しています。

### 🚀 AtCoderへの提出

`Main.java`ファイルをAtCoderの提出形式に自動で整形し、クリップボードにコピーするタスクです。`package`宣言の削除や、デバッグ用出力のコメントアウトを自動で行います。

#### 使い方

1. 提出時に**残したい**最終的な答えの出力行の末尾に、目印として`// SUBMIT`というコメントを追記します。

    ```java
    System.out.println(answer); // SUBMIT
    ```

2. 提出したい`Main.java`ファイルを開いた状態で、`Ctrl + Shift + P`を押してコマンドパレットを開きます。
3. 「`Tasks: Run Task`」と入力・選択し、次に「`Copy for AtCoder Submission`」を選択して実行します。
4. クリップボードに整形後のコードがコピーされるので、AtCoderの提出ページに貼り付けて提出します。

---

### 🧹 ビルド成果物のクリーンアップ

リポジトリ内のすべてのコンテストフォルダ（`abc424`, `abc425`など）に対して、一括で`mvn clean`を実行し、ビルド成果物（`target`フォルダなど）を削除します。

#### 使い方

1. `Ctrl + Shift + P`を押してコマンドパレットを開きます。
2. 「`Tasks: Run Task`」と入力・選択し、次に「`mvnClean`」を選択して実行します。

---

## コンテスト履歴

各フォルダは、参加したコンテストに対応しています。フォルダ名をクリックすると、該当するコンテストのページに移動します。

### Rated (Algorithm)

| dir | コンテスト名 | 参加日 | パフォーマンス |
|:---|:---|:---|---:|
| [abc424](./abc424/) | [AtCoder × Engineer Guild オンサイトコンテスト ～集結！高レート人材～予選（AtCoder Beginner Contest 424）](https://atcoder.jp/contests/abc424)| 2025/9/20 | 223 |
| [abc425](./abc425/) | [ユニークビジョンプログラミングコンテスト2025 秋（AtCoder Beginner Contest 425）](<https://atcoder.jp/contests/abc425>)| 2025/9/27 | 176 |
| [abc426](./abc426/) | [AtCoder Beginner Contest 426](https://atcoder.jp/contests/abc426)| 2025/10/4 | 205 |

### Daily Training

| dir | コンテスト名 | 参加日 |
|:---|:---|:---|
| [adt_easy_20250917_3](./adt_easy_20250917_3/) | [AtCoder Daily Training EASY 2025/09/17 20:00start](https://atcoder.jp/contests/adt_easy_20250917_3)|  |
| [adt_easy_20250918_2](./adt_easy_20250918_2/) | [AtCoder Daily Training EASY 2025/09/18 18:30start](https://atcoder.jp/contests/adt_easy_20250918_2)|  |
| [adt_easy_20250918_3](./adt_easy_20250918_3/) | [AtCoder Daily Training EASY 2025/09/18 20:30start](https://atcoder.jp/contests/adt_easy_20250918_3)|  |
| [adt_easy_20250923_3](./adt_easy_20250923_3/) | [AtCoder Daily Training EASY 2025/09/23 19:30start](https://atcoder.jp/contests/adt_easy_20250923_3)|  |
