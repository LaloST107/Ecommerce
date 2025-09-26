export default function ProductGrid({ products }) {
  return (
    <section className="grid grid-cols-2 md:grid-cols-4 gap-6 p-6">
      {products.map(product => (
        <div key={product.id} className="border p-4 rounded shadow hover:shadow-lg">
          <img src={product.image} alt={product.name} className="h-40 w-full object-cover"/>
          <h3 className="mt-2 font-semibold">{product.name}</h3>
          <p className="text-gray-600">{product.price} kr</p>
          <button className="mt-2 bg-yellow-400 px-4 py-1 rounded">comprar</button>
        </div>
      ))}
    </section>
  );
}
