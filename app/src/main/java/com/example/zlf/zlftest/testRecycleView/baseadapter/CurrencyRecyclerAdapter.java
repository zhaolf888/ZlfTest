package com.example.zlf.zlftest.testRecycleView.baseadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daimhim on 2016/11/2.
 */

public class CurrencyRecyclerAdapter<T, V extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<V> {
    private Context mContext;
    private List<T> mTList;
    private RViewAdapter<T, V> mAdapter;
    private int mCount = -1;
    private RViewAdapterLife mlife;

    public List<T> getData() {
        return mTList;
    }

    public CurrencyRecyclerAdapter(Context context, List<T> TList, RViewAdapter<T, V> adapter) {
        mContext = context;
        mAdapter = adapter;
        if (null != TList) {
            mTList = TList;
        } else {
            mTList = new ArrayList<T>();
        }
    }

    public void setMlife(RViewAdapterLife mlife) {
        this.mlife = mlife;
    }

    public CurrencyRecyclerAdapter(Context context, List<T> TList, int count, RViewAdapter<T, V> adapter) {
        mContext = context;
        mAdapter = adapter;
        this.mCount = count;
        if (null != TList || TList.size() != 0) {
            mTList = TList;
        } else {
            mTList = new ArrayList<T>();
        }
    }

    //修改item数量
    public CurrencyRecyclerAdapter<T, V> setCount(int count) {
        mCount = count;
        return this;
    }

    //添加一条item
    public void add(T t, int position) {
        this.mTList.add(position, t);
        notifyItemInserted(position);
    }

    //交换两条item
    public void add(int fromPosition, int toPosition) {
        T t = this.mTList.get(fromPosition);
        this.mTList.set(fromPosition, this.mTList.get(toPosition));
        this.add(t, toPosition);
        notifyItemMoved(fromPosition, toPosition);
    }

    //刷新一条item
    public void refreshItem(T t, int position) {
        mTList.set(position, t);
        notifyItemChanged(position);
    }

    //删除一条item
    public void delete(int position) {
        mTList.remove(position);
        notifyItemRemoved(position);
    }

    //删除多条
    public void deletes(int positionStart, int itemCount) {
        for (int i = 0; i < itemCount; i++) {
            this.mTList.remove(positionStart);
        }
        notifyItemRangeRemoved(positionStart, itemCount);
    }

    //刷新全部item
    public void refresh(List<T> mList) {
        this.mTList = mList;
        notifyDataSetChanged();
    }

    //加载多个
    public void loads(List<T> mTList) {
        this.mTList.addAll(mTList);
        notifyItemRangeInserted(this.mTList.size() - mTList.size() + 1, mTList.size());
    }

    @Override
    public V onCreateViewHolder(ViewGroup parent, int viewType) {
        return mAdapter.onCreateViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(V holder, int position) {
        mAdapter.onBindViewHolder(holder, position, mTList.get(position));
    }

    @Override
    public int getItemCount() {
        if (mCount != -1) {
            if (null == mTList) {
                return 0;
            } else {
                if (mCount > mTList.size()) {
                    return mTList.size();
                } else {
                    return mCount;
                }
            }
        } else {
            if (null != mTList) {
                return mTList.size();
            } else {
                return 0;
            }
        }
    }

    @Override
    public int getItemViewType(int position) {
        try {
//        if (mTList.size() <= position)
            return mAdapter.getItemViewType(position, mTList.get(position));
        } catch (Exception e) {

        }
        return mAdapter.getItemViewType(position, null);
    }

    @Override //StaggeredGridLayoutManager 加载数据之前
    public void onViewAttachedToWindow(V holder) {
        if (mlife != null) {
            mlife.onAttachWindow(rv, holder);
        }
        super.onViewAttachedToWindow(holder);
    }

    @Override  //清除缓存之前
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
    }

    private RecyclerView rv;

    @Override  //GridLayoutManager 加载数据之前
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.rv = recyclerView;
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override //判断是否可以回收  如果视图应该被回收，则返回真，否则为假
    public boolean onFailedToRecycleView(V holder) {
        return super.onFailedToRecycleView(holder);
    }

    @Override //滑出屏幕
    public void onViewDetachedFromWindow(V holder) {
        super.onViewDetachedFromWindow(holder);
    }

    public interface RViewAdapter<T, V> {
        public V onCreateViewHolder(ViewGroup parent, int viewType);

        public void onBindViewHolder(V holder, int position, T t);

        public int getItemViewType(int position, T t);

    }

    public interface RViewAdapterLife {
        public void onAttachWindow(RecyclerView recyclerView, RecyclerView.ViewHolder holder);
    }
}
