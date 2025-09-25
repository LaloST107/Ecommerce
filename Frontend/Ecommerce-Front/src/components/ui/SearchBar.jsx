import { useState } from "react";
import { FiSearch } from "react-icons/fi";

export default function SearchBar({ onSearch }) {
  const [query, setQuery] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    if (query.trim() && onSearch) {
      onSearch(query);
    }
  };

  return (
    <form
      onSubmit={handleSubmit}
      className="flex items-center w-full max-w-md border rounded-full px-4 py-2 bg-white shadow-sm"
    >
      <input
        type="text"
        placeholder="¿Qué estás buscando?" 
        className="flex-grow outline-none text-sm text-gray-700"
        value={query}
        onChange={(e) => setQuery(e.target.value)}
      />
      <button
        type="submit"
        className="ml-2 text-gray-600 hover:text-black transition-colors"
      >
        <FiSearch size={20} />
      </button>
    </form>
  );
}
