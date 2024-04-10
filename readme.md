# Rational
Класс для работы с рациональными числами, т.е. числами, которые можно представить в виде обыкновенной дроби, в которой числитель и знаменатель — целые числа. Примеры чисел: `1/2`, `3/4`, `-5/2`.

&nbsp;

Класс позволяет создавать объекты обыкновенных дробей с заданными числителем и знаменателем или же со значением по умолчанию (`0`/`1`).

При попытке создания дроби с нулевым знаменателем генерируется исключение `ArithmeticException("division by zero !")`.

Если дробь отрицательна, минус стоит перед числителем.

При создании дроби она сокращается, если такая возможность есть. Например, дробь `5/10` сократится до `1/2`.

&nbsp;

Также класс предоставляет возможность проводить с обыкновенными дробями

- элементарные операции: сложение, вычитание, умножение, деление.

- сравнения: на равно, на меньше, на меньше или равно.

При попытке деления на ноль генерируется исключение `ArithmeticException("division by zero !")`.

# Tests
Класс с примером теста на класс `Rational`. 

Пример теста (`void testStandardConstructor()`), проверяет значения числителя и знаменателя стандартного экземпляра класса.

Тест `testConstructor()` проверяет различные варианты создания рациональных чисел.

Тест `testZeroDenominator()` проверяет генерацию исключения при создании дроби с нулевым знаменателем.

Тест `testMultiply()` проверяет различные варианты перемножения рациональных чисел.

Тест `testDivisionZeroDenominator()` проверяет генерацию исключения при делении рационального числа на ноль.

Тест `testPlus` проверяет различные варианты сложения рациональных чисел. 

Метод `minus()` не тестируется, так как является комбинацией методов `plus()` и `multiply()`.

Тест `testEquals()` проверяет работу функции проверки рациональных чисел на равенство.

Тест `testLess()` проверяет работу функции сравнения рациональных чисел. Класс `Rational` содержит ошибку в методе `less`, поэтому данный тест фейлится.

Метод `lessOrEqual()` не тестируется, так как является комбинацией методов `equals()` и `less()`