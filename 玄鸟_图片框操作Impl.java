package com.e4a.runtime.components.impl.android.����_ͼƬ��������;

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

public class ����_ͼƬ�����Impl extends ComponentImpl implements ����_ͼƬ����� {

    public ����_ͼƬ�����Impl(ComponentContainer ����) {
        super(����);
    }

    // ΪͼƬ���������Ź���
    public void ������Ź���(ViewComponent ͼƬ��) {
        // ����һ��PhotoViewAttacher���󣬲���ͼƬ�����ͼ��������
        PhotoViewAttacher ���Ÿ����� = new PhotoViewAttacher((ImageView)ͼƬ��.getView());
        
        // ���õ�������
        ���Ÿ�����.setOnViewTapListener(new OnViewTapListener() {
            public void onViewTap(View ͼƬ��, float x, float y) {
                ͼƬ�򱻵���();
            }
        });
        
        // ���ó�������
        ���Ÿ�����.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ͼƬ�򱻳���();
                return true;
            }
        });
    }
   
    public void ͼƬ�򱻵���() {
        EventDispatcher.dispatchEvent(this, "ͼƬ�򱻵���", new Object[0]);
    }
    
    public void ͼƬ�򱻳���() {
        EventDispatcher.dispatchEvent(this, "ͼƬ�򱻳���", new Object[0]);
    }
    
}