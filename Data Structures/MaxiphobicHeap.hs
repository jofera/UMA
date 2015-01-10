-------------------------------------------------------------------------------
-- Estructuras de Datos. 2º Curso. ETSI Informática. UMA
--
-- PRACTICA 5ª. Ejercicio 8 de la cuarta relación (montículos maxifóbicos en Haskel)
--
-- (completa y sustituye los siguientes datos)
-- Titulación: Grado en Ingeniería de Computadores
-- Alumno: FERNANDEZ JAIME, GONZALO
-- Fecha de entrega:  30 | 11 | 2012
--
-------------------------------------------------------------------------------

module MaxiphobicHeap
  ( Heap
  , empty
  , isEmpty
  , minElem
  , delMin
  , insert   -- puede definirse via merge
  , merge
-- los siguientes son auxiliares
  , mkHeap
--  , isHeap -- si exportamos leftChild, rightChild puede ser auxiliar
  , verifyOP -- si exportamos leftChild, rightChild puede ser auxiliar

  , drawOnWith
  ) where

import DataStructures.Graphics.DrawTrees
import Test.QuickCheck

data Heap a = Empty | Node a Int (Heap a) (Heap a) deriving Show

-- number of elements
size :: Heap a -> Int
size Empty            = 0
size (Node _ sz _ _)  = sz

empty :: Heap a
empty  = Empty

isEmpty :: Heap a -> Bool
isEmpty Empty  = True
isEmpty _      = False

singleton :: a -> Heap a
singleton x  = Node x 1 Empty Empty

insert :: (Ord a) => a -> Heap a -> Heap a
insert x h  = merge (singleton x) h

minElem :: Heap a -> a
minElem Empty           = error "minElem on empty heap"
minElem (Node x _ _ _)  = x

delMin :: (Ord a) => Heap a -> Heap a
delMin Empty             = error "delMin on empty heap"
delMin (Node _ _ lh rh)  = merge lh rh

----------------------------------------------------------
-- VVVVVVVVVVVV-SOLO TOCAR ABAJO-VVVVVVVVVVVV--------------
---------------------------------------------------------
-- Al llamar a esta función con tres árboles, me devuelve una terna
-- con los tres árboles ordenados de menor a mayor
ordenaArboles :: (Ord a) => Heap a -> Heap a -> Heap a -> (Heap a, Heap a, Heap a)
ordenaArboles u v w | su <= sw && sv <= sw = (u,v,w)
                    | su <= sw && sw <= sv = (u,w,v)
                    | sv <= su && sw <= su = (v,w,u)
                  where (su,sv,sw) = (size u,size v,size w)
                    

-- recursively merges smallest subheaps. Achieves O(log n) complexity
merge :: (Ord a) => Heap a -> Heap a -> Heap a
merge Empty h'     = h'
merge h     Empty  = h
merge h@(Node x sz lh rh) h'@(Node x' sz' lh' rh')
 | x < x'          = Node x (sz + sz') (merge menor1 menor2) mayor
 | otherwise       = Node x' (sz + sz') (merge menor1' menor2') mayor'
  where 
    (menor1,menor2,mayor) = ordenaArboles lh rh h'
    (menor1',menor2',mayor') = ordenaArboles h lh' rh'

----------------------------------------------------------
-- ^^^^^^^^^^^^^^-- SOLO TOCAR ARRIBA ^^^^^^^^^^^ ---------
----------------------------------------------------------

-- Efficient O(n) bottom-up construction for heaps
mkHeap :: (Ord a) => [a] -> Heap a
mkHeap []  = empty
mkHeap xs  = mergeLoop (map singleton xs)
  where
    mergeLoop [h]  = h
    mergeLoop hs   = mergeLoop (mergePairs hs)

    mergePairs []         = []
    mergePairs [h]        = [h]
    mergePairs (h:h':hs)  = merge h h' : mergePairs hs

-------------------------------------------------------------------------------
-- Generating arbitrary Heaps
-------------------------------------------------------------------------------
instance (Ord a, Arbitrary a) => Arbitrary (Heap a) where
  arbitrary  = do
    xs <- arbitrary
    return (mkHeap xs)
-------------------------------------------------------------------------------
-- Invariants
-------------------------------------------------------------------------------
verifyOP :: (Ord a) => Heap a -> Bool
verifyOP Empty             = True
verifyOP (Node x _ lh rh)  = x `lessEq` lh && x `lessEq` rh
                           && verifyOP lh && verifyOP rh
 where
  x `lessEq` Empty            = True
  x `lessEq` (Node x' _ _ _)  = x<=x'
-------------------------------------------------------------------------------
-- Drawing a Heap
-------------------------------------------------------------------------------
instance Subtrees (Heap a) where
  subtrees Empty             = []
  subtrees (Node _ _ lh rh)  = [lh,rh]

instance (Show a) => ShowNode (Heap a) where
  showNode (Node x _ _ _) = show x

drawOnWith :: FilePath -> (a -> String) -> Heap a -> IO ()
drawOnWith file toString = _drawOnWith file showHeap
 where
  showHeap (Node x _ _ _) = toString x
