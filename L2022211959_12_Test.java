import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class L2022211959_12_Test {
    /**
     * <pre>
     * 测试用例：
     *   当任一输入为0时，预期输出为0。
     *   当输入包含负数或非数字字符时，预期输出为 "error: not a number"。
     *   对于有效的正整数输入，验证乘法操作的正确性。
     *   特别测试大数乘法，确保在极端情况下代码的稳定性和正确性。
     * </pre>
     */
    @Test
    public void testAll() {
        Solution12 solution = new Solution12();

        assertEquals("0", solution.multiply("0", "0"));
        assertEquals("0", solution.multiply("0", "2333"));
        assertEquals("0", solution.multiply("2333", "0"));
        assertEquals("error: not a number", solution.multiply("1.23", "-123"));//添加了测试小数
        assertEquals("error: not a number", solution.multiply("123", "-123"));
        assertEquals("error: not a number", solution.multiply("-123", "123"));
        assertEquals("error: not a number", solution.multiply("0", "-123"));
        assertEquals("error: not a number", solution.multiply("-123", "0"));

        assertEquals("error: not a number", solution.multiply("123", "ac"));
        assertEquals("error: not a number", solution.multiply("ac", "123"));
        assertEquals("error: not a number", solution.multiply("0", "ac"));
        assertEquals("error: not a number", solution.multiply("ac", "0"));
        
        assertEquals("56088", solution.multiply("123", "456"));
        assertEquals("1" + "0".repeat(1000), solution.multiply("1" + "0".repeat(500), "1" + "0".repeat(500)));
    }
}
