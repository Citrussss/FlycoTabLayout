package com.flyco.tablayoutsamples.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pisa
 * @version 1.0
 * @name FlycoTabLayout
 * @date 2019-09-09 21:55
 * @effect :
 */
public class SimpleHome2Adapter extends FragmentStateAdapter {
    private final List<Fragment> list = new ArrayList<>();
    /**
     * @param fragmentActivity if the {@link ViewPager2} lives directly in a
     *                         {@link FragmentActivity} subclass.
     * @see FragmentStateAdapter#FragmentStateAdapter(Fragment)
     * @see FragmentStateAdapter#FragmentStateAdapter(FragmentManager, Lifecycle)
     */
    public SimpleHome2Adapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    /**
     * @param fragment if the {@link ViewPager2} lives directly in a {@link Fragment} subclass.
     * @see FragmentStateAdapter#FragmentStateAdapter(FragmentActivity)
     * @see FragmentStateAdapter#FragmentStateAdapter(FragmentManager, Lifecycle)
     */
    public SimpleHome2Adapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    /**
     * @param fragmentManager of {@link ViewPager2}'s host
     * @param lifecycle       of {@link ViewPager2}'s host
     * @see FragmentStateAdapter#FragmentStateAdapter(FragmentActivity)
     * @see FragmentStateAdapter#FragmentStateAdapter(Fragment)
     */
    public SimpleHome2Adapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    /**
     * Provide a new Fragment associated with the specified position.
     * <p>
     * The adapter will be responsible for the Fragment lifecycle:
     * <ul>
     * <li>The Fragment will be used to display an item.</li>
     * <li>The Fragment will be destroyed when it gets too far from the viewport, and its state
     * will be saved. When the item is close to the viewport again, a new Fragment will be
     * requested, and a previously saved state will be used to initialize it.
     * </ul>
     *
     * @param position
     * @see ViewPager2#setOffscreenPageLimit
     */
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return list.get(position);
    }

    /**
     * Returns the total number of items in the data set held by the adapter.
     *
     * @return The total number of items in this adapter.
     */
    @Override
    public int getItemCount() {
        return list.size();
    }
    /**
     * 设置数据源
     */
    public void setData(@NonNull List<Fragment> list){
        this.list.clear();
        this.list.addAll(list);
    }
}
