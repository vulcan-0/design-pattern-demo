# 软件开发实践

## 设计的坏味道

当软件出现下面任何一种气味时，就表明软件正在腐化。
- 僵化性（Rigidity）：很难对系统进行改动，因为每个改动都会迫使许多对系统其他部分的其他改动。
- 脆弱性（Fragility）：对系统的改动会导致系统中和改动的地方在概念上无关的许多地方出现问题。
- 牢固性（Immobility）：很难解开系统的纠结，使之成为一些可在其他系统中重用的组件。
- 粘滞性（Viscosity）：做正确的事情比做错误的事情要困难。
- 不必要的复杂性（Needless Complexity）：设计中包含有不具任何直接好处的基础结构。
- 不必要的重复性（Needless Repetition）：设计中包含有重复的结构，而该重复的结构本可以使用单一的抽象进行统一。
- 晦涩性（Opacity）：很难阅读、理解。没有很好地表现出意图。

敏捷开发人员如何保持尽可能好的设计？
- 1.要遵循敏捷实践去发现问题；
- 2.要应用设计原则去诊断问题；
- 3.要应用适当的设计模式去解决问题。

## 设计原则

下面这些面向对象设计的原则，有助于开发人员消除设计中的坏味道，并为当前的特性集构建出最好的设计。

> SOLID + 迪米特法则

### 单一职责原则（SRP，The Single Responsibility Principle）

就一个类而言，应该仅有一个引起它变化的原因。

### 开放——封闭原则（OCP，The Open-Close Principle）

软件实体（类、模块、函数等等）应该是可以扩展的，但不可修改的。

其特征在于：
- "对于扩展是开放的"：这意味着模块的行为是可以扩展的。当应用的需求改变时，我们可以对模块进行扩展，使其具有满足那些改变的新行为。换句话来说，我们可以改变模块的功能。
- "对于更改是封闭的"：对模块行为进行扩展时，不必改动模块的源代码或者二进制代码。模块的二进制执行版本，无论是可链接的库、DLL或者Java的jar文件，都无需改动。

做好上面两点的关键是抽象。

### Liskov替换原则（LSP，The Liskov Substitution Principle）
### 依赖倒置原则（DIP，The Dependency Inversion Principle）
### 接口隔离原则（ISP，The Interface Segregation Principle）
### 迪米特法则（LOD，Law Of Demeter，The Least Knowledge Principle）

## 参考资料
- 《设计模式：可复用面向对象软件的基础》 —— 机械工业出版社.典藏版
- [refactoringguru.cn](https://refactoringguru.cn/design-patterns)
- 《敏捷软件开发：原则、模式与实践》 —— 清华大学出版社