# TDD @FizzBuzz


## 开发环境
 - JDK1.8+
 
## 业务需求
你是一名体育老师，在某次课距离下课还有五分钟时，你决定搞一个游戏。此时有N名学生在上课。游戏的规则是：

1. 让所有学生排成一队，然后按顺序报数。

2. 学生报数时，如果所报数字是3的倍数，那么不能说该数字，而要说Fizz；如果所报数字是5的倍数，那么要说Buzz；如果所报数字是第7的倍数，那么要说Whizz。

3. 学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如3和5的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。

4. 学生报数时，如果所报数字包含了3，那么也不能说该数字，而是要说相应的单词，比如要报13的同学应该说Fizz。

5. 如果数字中包含了3，那么忽略规则2和规则3，比如要报30的同学只报Fizz，不报FizzBuzz。

6. 如果数字中包含了5，那么忽略规则4和规则5，并且忽略被3整除的判定，比如要报35的同学不报Fizz，报BuzzWhizz，其他case自己补齐。

7. 如果数字中包含了7，则忽略被5整除的判定，若同时还包含5，就忽略规则6中忽略被3整除的判定，比如要报75的同学只报Fizz，其他case自己补齐。

## 需求总结
1. 普通数字返回数字本身
2. 3的倍数 => Fizz，5的倍数 => Buzz，7的倍数 => Whizz
3. 整除规则可以任意组合
4. 包含数字3则忽略整除规则，显示Fizz
5. 包含5则忽略包含3的规则和被3整除的判定，总结说就是看所报数字：
    - 被5整除 Buzz，比如 15
    - 被7整除 Whizz，比如 56
    - 同时被5，7整除 BuzzWhizz，比如 35
6. 包含7，忽略被5整除的判定

## Tasking
/* 普通数字 */
- Given 数字4满足不包含3，5，7 且不能被3，5，7整除 When 玩游戏 Then 学生报4

/* 3，5，7的倍数 */
- Given 数字6满足只被3整除 When 玩游戏 Then 学生报Fizz
- Given 数字10满足只被5整除  When 玩游戏 Then 学生报Buzz
- Given 数字14满足只被7整除 When 玩游戏 Then 学生报Whizz

/* 15，21，35，105的倍数 */
- Given 数字60满足同时被3和5整除 When 玩游戏 Then 学生报FizzBuzz
- Given 数字21满足同时被3和7整除 When 玩游戏 Then 学生报FizzWhizz
- Given 数字140满足同时被5和7整除 When 玩游戏 Then 学生报BuzzWhizz
- Given 数字210满足同时被3和5和7整除 When 玩游戏 Then 学生报FizzBuzzWhizz

/* 包含3 */
- Given 数字13只包含3 When 玩游戏 Then 学生报Fizz
- Given 数字30满足被3和5整除，且包含3 When 玩游戏 Then 学生报Fizz

/* 包含5 */
- Given 数字15满足被5整除，且包含5 When 玩游戏 Then 学生报Buzz
- Given 数字56满足被7整除，且包含5 When 玩游戏 Then 学生报Whizz
- Given 数字35满足被5和7整除，且包含5 When 玩游戏 Then 学生报BuzzWhizz

/* 包含 7*/
- Given 数字75满足被3整除，且包含7和5 When 玩游戏 Then 学生报Fizz
- Given 数字357满足被3和7整除，且包含7和5和3 When 玩游戏 Then 学生报FizzWhizz
- Given 数字378，包含7和3 When 玩游戏 Then 学生报Fizz
- Given 数字70满足被7整除，且包含7 When 玩游戏 Then 学生报Whizz