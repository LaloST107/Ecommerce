import SearchBar from "../ui/SearchBar";

export default function Header() {
  return (
    <header className="flex justify-between items-center px-6 py-4 shadow-md">
      <div className="text-2xl font-bold">Mexican file</div>
      <SearchBar />
      <nav className="space-x-4 hidden md:flex">
        <a href="#">Bebidas</a>
        <a href="#">Comestibles</a>
        <a href="#">Snacks</a>
        <a href="#">Accesorios</a>
      </nav>
      <div className="flex space-x-4">
        <button>Acceso</button>
        <button>Crea una cueneta</button>
        <button>🛒</button>
      </div>
    </header>
  );
}