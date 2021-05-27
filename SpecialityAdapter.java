package com.vritti.orderbilling.adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.vritti.orderbilling.Merchant_MM.Model.Business;
import com.vritti.orderbilling.R;
import com.vritti.orderbilling.interfaces.AddProductToCartInterface;

import java.util.ArrayList;

public class SpecialityAdapter extends BaseAdapter {
    private ArrayList<Business> arrayList;

    private Context parent;
    private LayoutInflater mInflater;
    private ViewHolder holder;
    private String productId;
    int minteger = 0;
    private AddProductToCartInterface addProductToCartInterface;

    public SpecialityAdapter(Context context, ArrayList<Business> businessArrayList) {
        parent = context;
        arrayList = businessArrayList;
        mInflater = LayoutInflater.from(parent);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressWarnings("deprecation")
    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        final int pos = position;

        try{
            if (convertView == null) {
                convertView = mInflater.inflate(R.layout.custom_speciality_row, null);
                holder = new ViewHolder();

                holder.card_view =  convertView.findViewById(R.id.card_view);
                holder.bsname = (TextView) convertView.findViewById(R.id.textview_category_name);
                holder.subcatcount = (TextView) convertView.findViewById(R.id.txt_subcat_count);//txt_subcat_count
                holder.subcatcount.setVisibility(View.GONE);
                holder.imageview_cat_logo = (ImageView) convertView.findViewById(R.id.imageview_cat_logo);
                holder.rel_lay_grid = convertView.findViewById(R.id.rel_lay_grid);

                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }


        holder.bsname.setText(arrayList.get(position).getSegmentDescription());

            if(arrayList.get(position).getSegmentDescription().equalsIgnoreCase("Electronics")){
                try{
                    Picasso.with(parent)
                            .load(R.drawable.electronics_sp)
                            .skipMemoryCache()
                            // .placeholder(R.drawable.aata1).error(R.drawable.error)      // optional
                            //.resize(60,60)                        // optional
                            .into(holder.imageview_cat_logo);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }else if(arrayList.get(position).getSegmentDescription().equalsIgnoreCase("Bakery")){
                try{
                    Picasso.with(parent)
                            .load(R.drawable.bakery_sp)
                            .skipMemoryCache()

                            // .placeholder(R.drawable.aata1).error(R.drawable.error)      // optional
                            //.resize(60,60)                        // optional
                            .into(holder.imageview_cat_logo);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }else if(arrayList.get(position).getSegmentDescription().equalsIgnoreCase("Grocery")){
                try{
                    Picasso.with(parent)
                            .load(R.drawable.grocery)
                            .skipMemoryCache()

                            // .placeholder(R.drawable.aata1).error(R.drawable.error)      // optional
                            //.resize(60,60)                        // optional
                            .into(holder.imageview_cat_logo);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }else if(arrayList.get(position).getSegmentDescription().equalsIgnoreCase("Fashion")){
                try{
                    Picasso.with(parent)
                            .load(R.drawable.fashion_sp)
                            .skipMemoryCache()

                            // .placeholder(R.drawable.aata1).error(R.drawable.error)      // optional
                            //.resize(60,60)                        // optional
                            .into(holder.imageview_cat_logo);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }else if(arrayList.get(position).getSegmentDescription().equalsIgnoreCase("Health and Medicine")){
                try{
                    Picasso.with(parent)
                            .load(R.drawable.healthmedicine_sp)
                            .skipMemoryCache()

                            // .placeholder(R.drawable.aata1).error(R.drawable.error)      // optional
                            //.resize(60,60)                        // optional
                            .into(holder.imageview_cat_logo);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }else if(arrayList.get(position).getSegmentDescription().equalsIgnoreCase("Household")){
                try{
                    Picasso.with(parent)
                            .load(R.drawable.household_sp)
                            .skipMemoryCache()

                            // .placeholder(R.drawable.aata1).error(R.drawable.error)      // optional
                            //.resize(60,60)                        // optional
                            .into(holder.imageview_cat_logo);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }else if(arrayList.get(position).getSegmentDescription().equalsIgnoreCase("Namkeen")){
                try{
                    Picasso.with(parent)
                            .load(R.drawable.namkeen)
                            .skipMemoryCache()

                            // .placeholder(R.drawable.aata1).error(R.drawable.error)      // optional
                            //.resize(60,60)                        // optional
                            .into(holder.imageview_cat_logo);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }else if(arrayList.get(position).getSegmentDescription().equalsIgnoreCase("Nonveg")){
                try{
                    Picasso.with(parent)
                            .load(R.drawable.nonveg)
                            .skipMemoryCache()

                            // .placeholder(R.drawable.aata1).error(R.drawable.error)      // optional
                            //.resize(60,60)                        // optional
                            .into(holder.imageview_cat_logo);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }else if(arrayList.get(position).getSegmentDescription().equalsIgnoreCase("Dryfruits")){
                try{
                    Picasso.with(parent)
                            .load(R.drawable.dryfruits)
                            .skipMemoryCache()

                            // .placeholder(R.drawable.aata1).error(R.drawable.error)      // optional
                            //.resize(60,60)                        // optional
                            .into(holder.imageview_cat_logo);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }else if(arrayList.get(position).getSegmentDescription().equalsIgnoreCase("Restaurants")){
                try{
                    Picasso.with(parent)
                            .load(R.drawable.restaurant)
                            .skipMemoryCache()

                            // .placeholder(R.drawable.aata1).error(R.drawable.error)      // optional
                            //.resize(60,60)                        // optional
                            .into(holder.imageview_cat_logo);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }else if(arrayList.get(position).getSegmentDescription().equalsIgnoreCase("Stationery")){
                try{
                    Picasso.with(parent)
                            .load(R.drawable.stationary)
                            .skipMemoryCache()
                            // .placeholder(R.drawable.aata1).error(R.drawable.error)      // optional
                            //.resize(60,60)                        // optional
                            .into(holder.imageview_cat_logo);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }else if(arrayList.get(position).getSegmentDescription().equalsIgnoreCase("Sweets and Namkeen")){
                try{
                    Picasso.with(parent)
                            .load(R.drawable.sweet_sp)
                            .skipMemoryCache()

                            // .placeholder(R.drawable.aata1).error(R.drawable.error)      // optional
                            //.resize(60,60)                        // optional
                            .into(holder.imageview_cat_logo);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }else if(arrayList.get(position).getSegmentDescription().equalsIgnoreCase("Vegetable and Fruits")){
                try{
                    Picasso.with(parent)
                            .load(R.drawable.vegetables_sp)
                            .skipMemoryCache()
                            // .placeholder(R.drawable.aata1).error(R.drawable.error)      // optional
                            //.resize(60,60)                        // optional
                            .into(holder.imageview_cat_logo);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }else if(arrayList.get(position).getSegmentDescription().equalsIgnoreCase("Wholesale")){
                try{
                    Picasso.with(parent)
                            .load(R.drawable.wholesale)
                            .skipMemoryCache()
                            // .placeholder(R.drawable.aata1).error(R.drawable.error)      // optional
                            //.resize(60,60)                        // optional
                            .into(holder.imageview_cat_logo);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }else if(arrayList.get(position).getSegmentDescription().equalsIgnoreCase("Books")){
                try{
                    Picasso.with(parent)
                            .load(R.drawable.books_sp)
                            .skipMemoryCache()
                            // .placeholder(R.drawable.aata1).error(R.drawable.error)      // optional
                            //.resize(60,60)                        // optional
                            .into(holder.imageview_cat_logo);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }else if(arrayList.get(position).getSegmentDescription().equalsIgnoreCase("Offers and promotion")){
            try{
                Picasso.with(parent)
                        .load(R.drawable.offer)
                        .skipMemoryCache()
                        // .placeholder(R.drawable.aata1).error(R.drawable.error)      // optional
                        //.resize(60,60)                        // optional
                        .into(holder.imageview_cat_logo);

            }catch (Exception e){
                e.printStackTrace();
            }
        }

        if (position % 9 == 0) {
              holder.rel_lay_grid.setBackgroundColor(parent.getResources().getColor(R.color.grid9));
        }else if (position % 8 == 0) {
            holder.rel_lay_grid.setBackgroundColor(parent.getResources().getColor(R.color.grid8));
        }else if (position % 7 == 0) {

            holder.rel_lay_grid.setBackgroundColor(parent.getResources().getColor(R.color.grid7));
        }else if (position % 6 == 0) {
            // holder.card_view.setBackgroundColor(Color.parseColor("#fee9ce"));
            holder.rel_lay_grid.setBackgroundColor(parent.getResources().getColor(R.color.grid6));
        }else if (position % 5 == 0) {
            // holder.card_view.setBackgroundColor(Color.parseColor("#fee9ce"));
            holder.rel_lay_grid.setBackgroundColor(parent.getResources().getColor(R.color.grid5));
        }else if (position % 4 == 0) {
            // holder.card_view.setBackgroundColor(Color.parseColor("#fee9ce"));
            holder.rel_lay_grid.setBackgroundColor(parent.getResources().getColor(R.color.grid4));
        }else if (position % 3 == 0) {
            // holder.card_view.setBackgroundColor(Color.parseColor("#fee9ce"));
            holder.rel_lay_grid.setBackgroundColor(parent.getResources().getColor(R.color.grid3));
        }else if (position % 2 == 0) {
            // holder.card_view.setBackgroundColor(Color.parseColor("#fee9ce"));
            holder.rel_lay_grid.setBackgroundColor(parent.getResources().getColor(R.color.grid2));
        }else if (position % 1 == 0) {
            // holder.card_view.setBackgroundColor(Color.parseColor("#fee9ce"));
            holder.rel_lay_grid.setBackgroundColor(parent.getResources().getColor(R.color.grid1));
        }else if(position == 0){
            // holder.card_view.setBackgroundColor(Color.parseColor("#fee9ce"));
            holder.rel_lay_grid.setBackgroundColor(parent.getResources().getColor(R.color.grid1));
        }

        /*if (position == 0) {
            // holder.card_view.setBackgroundColor(Color.parseColor("#fee9ce"));
            //holder.rel_lay_grid.setBackgroundColor(Color.parseColor("#fee9ce"));
            holder.rel_lay_grid.setBackgroundColor(parent.getResources().getColor(R.color.grid1));
        }else if (position  == 1) {
            // holder.card_view.setBackgroundColor(Color.parseColor("#fee9ce"));
            holder.rel_lay_grid.setBackgroundColor(parent.getResources().getColor(R.color.grid2));
        }else if (position == 2) {
            // holder.card_view.setBackgroundColor(Color.parseColor("#fee9ce"));
            holder.rel_lay_grid.setBackgroundColor(parent.getResources().getColor(R.color.grid3));
        }else if (position == 3) {
            // holder.card_view.setBackgroundColor(Color.parseColor("#fee9ce"));
            holder.rel_lay_grid.setBackgroundColor(parent.getResources().getColor(R.color.grid4));
        }else if (position == 4) {
            // holder.card_view.setBackgroundColor(Color.parseColor("#fee9ce"));
            holder.rel_lay_grid.setBackgroundColor(parent.getResources().getColor(R.color.grid5));
        }else if (position == 5) {
            // holder.card_view.setBackgroundColor(Color.parseColor("#fee9ce"));
            holder.rel_lay_grid.setBackgroundColor(parent.getResources().getColor(R.color.grid6));
        }else if (position == 6) {
            // holder.card_view.setBackgroundColor(Color.parseColor("#fee9ce"));
            holder.rel_lay_grid.setBackgroundColor(parent.getResources().getColor(R.color.grid7));
        }else if (position == 7) {
            // holder.card_view.setBackgroundColor(Color.parseColor("#fee9ce"));
            holder.rel_lay_grid.setBackgroundColor(parent.getResources().getColor(R.color.grid8));
        }else if (position == 8) {
            // holder.card_view.setBackgroundColor(Color.parseColor("#fee9ce"));
            holder.rel_lay_grid.setBackgroundColor(parent.getResources().getColor(R.color.grid9));
        }else {
            // holder.card_view.setBackgroundColor(Color.parseColor("#fee9ce"));
            holder.rel_lay_grid.setBackgroundColor(parent.getResources().getColor(R.color.grid9));
        }*/
        }catch (Exception e){
            e.printStackTrace();
        }
        return convertView;
    }

    private static class ViewHolder {
        TextView bsname, subcatcount;
        ImageView imageview_cat_logo;
        CardView card_view;
        RelativeLayout rel_lay_grid;
    }

}