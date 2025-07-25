package muchamadalfaidzin.informatika.tilas.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import muchamadalfaidzin.informatika.tilas.R
import muchamadalfaidzin.informatika.tilas.model.SellerItem

class SellerAdapter(private val sellers: List<SellerItem>) :
    RecyclerView.Adapter<SellerAdapter.SellerViewHolder>() {

    inner class SellerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val item1: ImageView = itemView.findViewById(R.id.item1)
        val item2: ImageView = itemView.findViewById(R.id.item2)
        val item3: ImageView = itemView.findViewById(R.id.item3)
        val ivProfile: ImageView = itemView.findViewById(R.id.ivProfile)
        val tvSellerName: TextView = itemView.findViewById(R.id.tvSellerName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SellerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_seller, parent, false)
        return SellerViewHolder(view)
    }

    override fun onBindViewHolder(holder: SellerViewHolder, position: Int) {
        val seller = sellers[position]
        holder.item1.setImageResource(seller.item1Res)
        holder.item2.setImageResource(seller.item2Res)
        holder.item3.setImageResource(seller.item3Res)
        holder.ivProfile.setImageResource(seller.profileRes)
        holder.tvSellerName.text = seller.sellerName
    }

    override fun getItemCount(): Int = sellers.size
}
