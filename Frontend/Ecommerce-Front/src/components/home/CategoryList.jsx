import CategoryIcon from "../ui/CategoryIcon";

export default function CategoryList({ categories }) {
  return (
    <section className="flex justify-center space-x-6 overflow-x-auto py-6">
      {categories.map(cat => (
        <div key={cat.id} className="text-center">
          <CategoryIcon icon={cat.icon} />
          <p>{cat.name}</p>
          <span className="text-sm text-gray-500">{cat.count}</span>
        </div>
      ))}
    </section>
  );
}
