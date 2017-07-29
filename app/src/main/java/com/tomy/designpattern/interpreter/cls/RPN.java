package com.tomy.designpattern.interpreter.cls;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class RPN
{
    private ArrayList<String> expressionFromUser = new ArrayList<>();// 存储中序表达式
    private ArrayList<String> rpnExpression = new ArrayList<>();// 存储右序表达式
    private AbstractExpresstion mAbstractExpresstion;// 结果

    // 依据输入信息创建对象，将数值与操作符放入ArrayList中
    public RPN(String input)
    {
        StringTokenizer st = new StringTokenizer(input, "+-*/()", true);
        while (st.hasMoreElements())
        {
            expressionFromUser.add(st.nextToken());
        }
    }

    // 将中序表达式转换为右序表达式
    //将用户输入的表达式，转成逆波兰表达式
    private void toRight()
    {
        Stacks aStack = new Stacks();
        String operator;
        int position = 0;
        while (true)
        {
            if (Calculate.isOperator(expressionFromUser.get(position)))
            {
                if (aStack.top == -1 || expressionFromUser.get(position).equals("("))
                {
                    aStack.push(expressionFromUser.get(position));
                }
                else
                {
                    if (expressionFromUser.get(position).equals(")"))
                    {
                        if (!aStack.top().equals("("))
                        {
                            operator = (String) aStack.pop();
                            rpnExpression.add(operator);
                        }
                    }
                    else
                    {
                        if (Calculate.priority(expressionFromUser.get(position)) <= Calculate.priority((String) aStack.top()) && aStack.top != -1)
                        {
                            operator = (String) aStack.pop();
                            if (!operator.equals("("))
                                rpnExpression.add(operator);
                        }
                        aStack.push(expressionFromUser.get(position));
                    }
                }
            }
            else
                rpnExpression.add(expressionFromUser.get(position));
            position++;
            if (position >= expressionFromUser.size())
                break;
        }
        while (aStack.top != -1)
        {
            operator = (String) aStack.pop();
            rpnExpression.add(operator);
        }
    }

    // 对逆波兰右序表达式进行求值
    public void getResult(HashMap<String, Float> var)
    {
        this.toRight();
        Stack<AbstractExpresstion> stack = new Stack<>();
        AbstractExpresstion op1, op2;
        String is;
        Iterator it = rpnExpression.iterator();

        while (it.hasNext())
        {
            is = (String) it.next();
            if (Calculate.isOperator(is))
            {
                op2 = stack.pop();
                op1 = stack.pop();
                stack.push(Calculate.twoResult(is, op1, op2));
            }
            else
                stack.push(new VarExpresstion(is));
        }
        mAbstractExpresstion = stack.pop();
        it = expressionFromUser.iterator();
        while (it.hasNext())
        {
            System.out.print((String) it.next());
        }
        System.out.println("=" + mAbstractExpresstion.interpreter(var));
    }

    public static class Calculate
    {
        // 判断是否为操作符号
        public static boolean isOperator(String operator)
        {
            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("(") || operator.equals(")"))
                return true;
            else
                return false;
        }

        // 设置操作符号的优先级别
        public static int priority(String operator)
        {
            if (operator.equals("+") || operator.equals("-") || operator.equals("("))
                return 1;
            else if (operator.equals("*") || operator.equals("/"))
                return 2;
            else
                return 0;
        }

        // 做2值之间的计算
        public static AbstractExpresstion twoResult(String op, AbstractExpresstion a, AbstractExpresstion b)
        {
            try
            {

                AbstractExpresstion result = null;
                switch (op)
                {
                    case "+":
                        result = new AddExpresstion(a, b);
                        break;
                    case "-":
                        result = new SubExpresstion(a, b);
                        break;
                    case "*":
                        result = new MultiExpresstion(a, b);
                        break;
                    case "/":
                        result = new DivExpresstion(a, b);
                        break;
                    default:
                        break;
                }
                return result;
            }
            catch (NumberFormatException e)
            {
                System.out.println("input has something wrong!");
                return null;
            }
        }
    }

    // 栈类
    public class Stacks
    {
        private LinkedList list = new LinkedList();
        int top = -1;

        public void push(Object value)
        {
            top++;
            list.addFirst(value);
        }

        public Object pop()
        {
            Object temp = list.getFirst();
            top--;
            list.removeFirst();
            return temp;
        }

        public Object top()
        {
            return list.getFirst();
        }
    }
}
