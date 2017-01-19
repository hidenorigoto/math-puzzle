# Q01

## Stream

- [具象不変コレクションクラス(Scala Documentation)](http://docs.scala-lang.org/ja/overviews/collections/concrete-immutable-collection-classes)

Streamを使うと無限リストを作れる。以下の場合、10から始まる無限リストになる。

```scala
val n = Stream from 10
```

型は `scala.collection.immutable.Stream[Int]` で、`Stream(10, ?)` という値になっている。

```console
scala> Stream from 10
res0: scala.collection.immutable.Stream[Int] = Stream(10, ?)
```

Long型の値のStreamにしたい場合は、mapを使う

```
scala> Stream from 10 map ( _.toLong )
res1: scala.collection.immutable.Stream[Long] = Stream(10, ?)
```

## Streamに対する操作

コレクション系のメソッドが使える

- [Scalaコレクションメソッドメモ(Hishidama's Scala collection method Memo)](http://www.ne.jp/asahi/hishidama/home/tech/scala/collection/method.html)

先頭の5要素を取り出したければ `take(n)` を使う。

```
scala> val s = Stream from 10
s: scala.collection.immutable.Stream[Int] = Stream(10, ?)

scala> s.take(5).foreach(println(_))
10
11
12
13
14
```

先頭の要素に直接アクセスする場合は、リストなので `(0)` を使う

```
scala> s.take(5)(0)
res2: Int = 10
```
