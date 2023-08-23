package com.e4a.runtime.components.impl.android.玄鸟_图片框操作类库;

import android.view.View;
import android.widget.ImageView;
import android.view.View.OnLongClickListener;

import com.e4a.runtime.android.StartActivity;
import com.e4a.runtime.android.mainActivity;
import com.e4a.runtime.components.ComponentContainer;
import com.e4a.runtime.components.impl.ComponentImpl;
import com.e4a.runtime.components.impl.android.ViewComponent;
import com.e4a.runtime.events.EventDispatcher;

import uk.co.senab.photoview.PhotoViewAttacher;
import uk.co.senab.photoview.PhotoViewAttacher.OnViewTapListener;

public class 玄鸟_图片框操作Impl extends ComponentImpl implements 玄鸟_图片框操作 {

    public 玄鸟_图片框操作Impl(ComponentContainer 容器) {
        super(容器);
    }

    // 为图片框增加缩放功能
    public void 添加缩放功能(ViewComponent 图片框) {
        // 创建一个PhotoViewAttacher对象，并将图片框的视图传入其中
        PhotoViewAttacher 缩放附加器 = new PhotoViewAttacher((ImageView)图片框.getView());
        
        // 设置单击监听
        缩放附加器.setOnViewTapListener(new OnViewTapListener() {
            public void onViewTap(View 图片框, float x, float y) {
                图片框被单击();
            }
        });
        
        // 设置长按监听
        缩放附加器.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                图片框被长按();
                return true;
            }
        });
    }
   
    public void 图片框被单击() {
        EventDispatcher.dispatchEvent(this, "图片框被单击", new Object[0]);
    }
    
    public void 图片框被长按() {
        EventDispatcher.dispatchEvent(this, "图片框被长按", new Object[0]);
    }
    
}