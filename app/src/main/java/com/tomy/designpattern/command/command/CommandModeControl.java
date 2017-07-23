package com.tomy.designpattern.command.command;

import com.tomy.designpattern.command.IControl;

import java.util.Stack;


public class CommandModeControl implements IControl
{
    private ICommand[] mOnICommands;
    private ICommand[] mOffICommands;
    private Stack<ICommand> stack = new Stack<>();

    /**
     * 初始化各个按钮的命令对象为空命令对象
     */
    public CommandModeControl()
    {
        mOnICommands = new ICommand[5];
        mOffICommands = new ICommand[5];

        ICommand noICommand = new NoCommand();

        for (int i = 0, len = mOnICommands.length; i < len; i++)
        {
            mOnICommands[i] = noICommand;
            mOffICommands[i] = noICommand;
        }
    }

    /**
     * @param slot 对应于一个按钮
     * @param onICommand 对应于打开动作的命令对象
     * @param offICommand 对应于关闭动作的命令对象
     */
    public void setCommand(int slot, ICommand onICommand, ICommand offICommand)
    {
        mOnICommands[slot] = onICommand;
        mOffICommands[slot] = offICommand;
    }

    /**
     * @param slot 打开动作
     */
    @Override
    public void onButton(int slot)
    {
        mOnICommands[slot].execute();
        stack.push(mOnICommands[slot]);
    }

    /**
     * @param slot 关闭动作
     */
    @Override
    public void offButton(int slot)
    {
        mOffICommands[slot].execute();
        stack.push(mOffICommands[slot]);
    }

    /**
     * 回退动作
     */
    @Override
    public void undoButton()
    {
        // TODO Auto-generated method stub
        stack.pop().undo();
    }
}
