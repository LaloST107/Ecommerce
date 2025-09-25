import { FaAppleAlt, FaBreadSlice, FaFish, FaDrumstickBite, FaCheese, FaCarrot, FaBox } from "react-icons/fa";
import { MdLocalDrink } from "react-icons/md";
import { GiSaltShaker } from "react-icons/gi";

const iconMap = {
  "Bebidas": MdLocalDrink,         
  "Alimentos generales": FaBox,             
  "Snacks": GiSaltShaker,       
  "Pan": FaBreadSlice,        
  "Frutas y verduras": FaAppleAlt,  
  "Carne y pollo": FaDrumstickBite,
  "Pescado y mariscos": FaFish,     
  "Lácteos, queso y huevo": FaCheese, 
  "Vegetariano": FaCarrot        
};

export default function CategoryIcon({ name, size = 28 }) {
  const IconComponent = iconMap[name] || FaBox; 

  return (
    <div className="flex items-center justify-center w-12 h-12 rounded-full bg-gray-100 shadow-sm">
      <IconComponent size={size} className="text-gray-700" />
    </div>
  );
}
