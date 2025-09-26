export default function HeroBanner({ title, subtitle, ctaText }) {
  return (
    <section className="bg-gray-800 text-white text-center py-16">
      <h1 className="text-3xl font-bold">{title}</h1>
      <p className="mt-2">{subtitle}</p>
      <button className="mt-6 px-6 py-2 bg-yellow-400 text-black font-semibold rounded">
        {ctaText}
      </button>
    </section>
  );
}
