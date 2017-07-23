package com.tomy.designpattern.composite.display;

import com.tomy.designpattern.composite.AbsMenuItem;

/**
 * Created by 易剑锋 on 2017/7/23.
 */

public interface IDisplayStrategy
{
    void handle(AbsMenuItem absMenuItem);
}
