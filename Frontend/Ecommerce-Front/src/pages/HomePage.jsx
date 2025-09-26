
import Header from "../components/layout/Header";
import Footer from "../components/layout/Footer";
import HeroBanner from "../components/home/HeroBanner";
import CategoryList from "../components/home/CategoryList";
import ProductGrid from "../components/home/ProductGrid";
import Testimonials from "../components/home/Testimonials";

export default function HomePage() {

  const categories = [
    { id: 1, name: "Cajas", icon: "🍞", count: 256 },
    { id: 2, name: "Latas", icon: "🥫", count: 175 },
    { id: 3, name: "Frutas", icon: "🍏", count: 199 },
  ];

  const products = [
    { id: 1, name: "salsas", price: 59, image: "/img/salsa.jpg" },
    { id: 2, name: "Tortillas", price: 35, image: "/img/tortillas.jpg" },
  ];

  const reviews = [
    { id: 1, user: "Chente", rating: 5, text: "¡Buena tienda online!" },
    { id: 2, user: "Marcela", rating: 4, text: "Entrega rápida. " },
  ];

  return (
    <>
      <Header />
      <HeroBanner title="Precios bajos en Mexican file." subtitle="compra ya" ctaText="Escoge tu precio"/>
      <CategoryList categories={categories}/>
      <ProductGrid products={products}/>
      <Testimonials reviews={reviews}/>
      <Footer />
    </>
  );
}
