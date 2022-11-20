export type Artist = {
    id: number;
    name: string;
    image: string;
    listeners: string;
    average: number;
    countVotes: number;
}

export type ArtistPage = {
    content: Artist[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    size: number;
    number: number;
    first: boolean;
    numberOfElements: number;
    empty: boolean;
}