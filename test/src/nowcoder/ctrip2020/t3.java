package nowcoder.ctrip2020;

/**
 * 模拟ElasticSearch中的FuzzyQuery中的单词纠正
 * 时间限制：C/C++语言 1000MS；其他语言 3000MS
 * 内存限制：C/C++语言 65536KB；其他语言 589824KB
 * 题目描述：
 * ElasticSearch 是常用的开源搜索引擎，支持fuzzyQuery 给搜索带来很大便利。
 *
 * 其简单原理如下，surprize有拼写错误，把z换成s后得到  surprise，即纠正一个字母，
 *
 * 就可以匹配正确的单词。
 *
 * 同样，把surprize的z替换成s，然后在末尾加个d，可以得到surprised。
 *
 *
 * 给定字典[ "surprise", "happy", "ctrip", "travel", "wellcome","student","system","program","editor"]
 *
 * 为正确单词。
 *
 *
 * 编程实现单词纠正，判断输入的单词能否在2(包含)次纠正操作内得到字典中的单词。
 *
 * 纠正操作是以下三种，
 *
 * 1：替换字符串中的一个字母;
 *
 * 2：删除字符串中的一个字母;
 *
 * 3：在字符串中增加一个字母。
 *
 * 输入
 * 待纠正的单词1
 *
 * ...
 *
 * 待纠正的单词n
 *
 * 输出
 * 如果可以匹配,请返回字典中的单词,
 *
 * 如果无法匹配,请返回字符串null
 *
 *
 * 样例输入
 * hipp
 * 样例输出
 * happy
 */
public class t3 {
}
