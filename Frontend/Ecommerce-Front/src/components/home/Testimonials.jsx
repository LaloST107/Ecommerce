export default function Testimonials({ reviews }) {
  return (
    <section className="px-6 py-12 bg-gray-50">
      <h2 className="text-2xl font-bold text-center mb-6">Testimonoio de la compra</h2>
      <div className="grid md:grid-cols-2 gap-6">
        {reviews.map(r => (
          <div key={r.id} className="p-4 bg-white shadow rounded">
            <p className="text-yellow-500">{"⭐".repeat(r.rating)}</p>
            <p className="mt-2">{r.text}</p>
            <p className="mt-2 text-sm text-gray-600">- {r.user}</p>
          </div>
        ))}
      </div>
    </section>
  );
}
