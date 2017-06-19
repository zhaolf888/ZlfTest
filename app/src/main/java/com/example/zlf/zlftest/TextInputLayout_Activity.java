package com.example.zlf.zlftest;/**
 * Created by Administrator on 2017/5/26 0026.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/**
 * 作者：zhaolifeng
 * 时间：2017/05/26 15:08
 * 描述：
 */
public class TextInputLayout_Activity  extends AppCompatActivity {

    /***
     * Design的输入容器(子控件需要包含EditText)
     */
    TextInputLayout mTextInputLayout;
    /**
     * EditText输入框
     */
    EditText mEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textinputlayout_activity);

        mTextInputLayout=(TextInputLayout)findViewById(R.id.a_textinputlayout);

//        1、setHint();设置提示语
//        2、setError();设置错误显示信息
//        3、setErrorEnabled();设置错误信息是否显示。true显示，false不显示。
//        4、getEditText();得到EditText的控件实例。
//

        //设置hint提示
        mTextInputLayout.setHint("请输入用户名");
        //获取TextInputLayout下的输入框
        mEditText=mTextInputLayout.getEditText();
        //设置对EditText输入的监听事件
        mEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //这儿判断操作，如果输入错误可以给用户提示
                if(s.length()<5){
                    mTextInputLayout.setErrorEnabled(true);
                    mTextInputLayout.setError("用户名不能小于6位");
                }else{
                    mTextInputLayout.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
